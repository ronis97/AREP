/*---------------
-- UNIQUE KEYs --
-----------------*/
ALTER TABLE StreetSections
	ADD CONSTRAINT uk_StreetSections
	UNIQUE (streetName, startOfTheSection, endOfTheSection);

ALTER TABLE SolutionsHistory
	ADD CONSTRAINT uk_SolutionsHistory
	UNIQUE (sectionId, reportDatetime);

ALTER TABLE Solutions
	ADD CONSTRAINT uk_Solutions
	UNIQUE (solutionName);

/*----------------
-- FOREIGN KEYs --
------------------*/
ALTER TABLE StreetSections
	ADD	CONSTRAINT fk_StreetSections_streetName_Streets
	FOREIGN KEY (streetName)
	REFERENCES Streets(streetName);

ALTER TABLE StreetSections
	ADD	CONSTRAINT fk_StreetSections_startOfTheSection_Streets
	FOREIGN KEY (startOfTheSection)
	REFERENCES Streets(streetName);

ALTER TABLE StreetSections
	ADD	CONSTRAINT fk_StreetSections_endOfTheSection_Streets
	FOREIGN KEY (endOfTheSection)
	REFERENCES Streets(streetName);

ALTER TABLE Traffic
	ADD	CONSTRAINT fk_Traffic_StreetSections
	FOREIGN KEY (sectionId)
	REFERENCES StreetSections(sectionId);

ALTER TABLE SolutionsHistory
	ADD	CONSTRAINT fk_SolutionsHistory_Traffic
	FOREIGN KEY (sectionId, reportDatetime)
	REFERENCES Traffic(sectionId, reportDatetime);

ALTER TABLE SolutionsHistory
	ADD	CONSTRAINT fk_SolutionsHistory_Solutions
	FOREIGN KEY (proposedSolution)
	REFERENCES Solutions(solutionId);