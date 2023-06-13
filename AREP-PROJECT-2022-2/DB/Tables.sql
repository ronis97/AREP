CREATE TABLE Streets (
	streetName VARCHAR(25) NOT NULL,
	
	CONSTRAINT pk_Streets PRIMARY KEY (streetName)
);

/*
Queries:
- Percentaje of sections of the city that are under construction and those that are not.
- Percentaje of sections of the city that are two way and those that are not.
*/
CREATE TABLE StreetSections (
	sectionId			SMALLINT 	NOT NULL AUTO_INCREMENT,
	streetName          VARCHAR(25) NOT NULL,
	startOfTheSection	VARCHAR(25) NOT NULL,
	endOfTheSection		VARCHAR(25) NOT NULL,
	isMainStreet        BOOLEAN     NOT NULL,
	numberOfRoads       TINYINT     NOT NULL,
	isTwoWay            BOOLEAN     NOT NULL,
	isUnderConstruction BOOLEAN     NOT NULL,
	
	CONSTRAINT pk_StreetSections PRIMARY KEY (sectionId)
);

/*
Queries:
- Detec sections with hight traffic rate in the moment of the query
- Time of the day with highest traffic
- Streets with most roads and their traffic data.
*/
CREATE TABLE Traffic (
	sectionId 	   SMALLINT 	 NOT NULL,
	reportDatetime DATETIME 	 NOT NULL,
	averageSpeed   DECIMAL(5, 2) NOT NULL,
	
	CONSTRAINT pk_Traffic PRIMARY KEY (sectionId, reportDatetime)
);

/*
Queries:
- Proposals with highest success rate
- Proposals with highest success rate in main streets
- Proposals with highest success rate in certain time of the day
*/
CREATE TABLE SolutionsHistory (
	solutionsHistoryId SMALLINT 	 NOT NULL AUTO_INCREMENT,	
	sectionId 	       SMALLINT 	 NOT NULL,
	reportDatetime     DATETIME 	 NOT NULL,
	proposedSolution   SMALLINT		 NOT NULL,
	successRate		   DECIMAL(5, 2) NOT NULL,
	
	CONSTRAINT pk_SolutionsHistory PRIMARY KEY (solutionsHistoryId)
);

CREATE TABLE Solutions (
	solutionId   SMALLINT	  NOT NULL AUTO_INCREMENT,
	solutionName VARCHAR(100) NOT NULL,
	additionDate  DATE 		  NOT NULL,
	
	CONSTRAINT pk_Solutions PRIMARY KEY (solutionId)
);

/*
- How hight can the traffic of the api be?, this is due to AWS free service limits.
*/