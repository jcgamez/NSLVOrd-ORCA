% Reference performance
accTestRef = 0.9;
% Increase the error due to method's variability
allowedError = 0.1; 
method = 'NNOP';

% Create the algorithm object
algorithmObj = NNOP();

% Clear parameter struct
clear param;

% Parameter hiddenN (Number of neurons in the hidden layer)
param.hiddenN = 10;

% Parameter iter (Number of iterations)
param.iter = 1000;

% Parameter lambda (Regularization parameter)
param.lambda = 0;

% Run the algorithm
info = algorithmObj.runAlgorithm(train,test,param);

trainCM = confusionmat(info.predictedTrain,train.targets);
testCM = confusionmat(info.predictedTest,test.targets);

accTrain = CCR.calculateMetric(trainCM);
accTest  = CCR.calculateMetric(testCM);

% Report accuracy
fprintf('.........................\n');
fprintf('Performing test for %s\n', method);
fprintf('Accuracy Train %f, Accuracy Test %f\n',accTrain,accTest);

if abs(accTestRef-accTest)<allowedError
    fprintf('Test accuracy matchs reference accuracy\n');
else
    warning('Test accuracy does NOT match reference accuracy');
end
