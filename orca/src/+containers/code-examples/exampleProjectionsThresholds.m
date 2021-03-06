% Note: this code should be run from orca/src/code-examples
addpath ../Algorithms/

% Load the different partitions of the dataset
load ../../exampledata/1-holdout/toy/matlab/train_toy.0
load ../../exampledata/1-holdout/toy/matlab/test_toy.0

% patterns refers to the input variables and targets to the output one
train.patterns = train_toy(:,1:end-1);
train.targets = train_toy(:,end);
test.patterns = test_toy(:,1:end-1);
test.targets = test_toy(:,end);

% Create the algorithm object
kdlorAlgorithm = KDLOR('kernelType','rbf','optimizationMethod','quadprog');

% Parameters: C (Cost), k (kernel width), u (to avoid singularities)
param.C = 10;
param.k = 0.1;
param.u = 0.001;


% Run algorithm
info1 = kdlorAlgorithm.runAlgorithm(train,test,param);
amaeTest1 = AMAE.calculateMetric(test.targets,info1.predictedTest);
% Build legend text
msg{1} = sprintf('KDLOR k=%f. AMAE=%f', param.k, amaeTest1);
msg{2} = 'Thresholds';

figure; hold on;
if (exist ('OCTAVE_VERSION', 'builtin') > 0)
  hist(info1.projectedTest,30);
else
  h1 = histogram(info1.projectedTest,30);
end
plot(info1.model.thresholds, ...
    zeros(length(info1.model.thresholds),1),...
    'r+', 'MarkerSize', 10, 'LineWidth', 2)
legend(msg)
legend('Location','NorthWest')
hold off;
