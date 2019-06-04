# Design-Patterns
Questão 1) (5,0) Implemente uma AbstractFactory para construção de carros (produtos: pneu, chassi e motor) que possui um limite de número máximo de instâncias para cada produto (pneu=4, chassi=3 e motor=2). Após a criação do número máximo de instâncias os métodos create deverão retornar as instâncias já criadas, em rodízio. A fábrica deve ser implementada como um Singleton. 
Ver exemplo de uso abaixo: 

MyFactory f = MyFactory.getInstance(4, 3, 2);

IMotor m1 = f.createMotor(); // Realiza a 1a instânciação do motor 

IMotor m2 = f.createMotor(); // Realiza a 2a instânciação do motor 

IMotor m3 = f.createMotor(); // Deve retornar o primeiro motor

IMotor m4 = f.createMotor(); // Deve retornar o segundo motor
