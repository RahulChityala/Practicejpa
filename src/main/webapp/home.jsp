<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IPL</title>
</head>
<body>
	<fieldset>
	<legend>Player Details</legend>
		<form action="addplayer">
			<label>Player Id:</label><input type="text" name="playerid"><br>
			<label>Player Name:</label><input type="text" name="playername"><br>
			<label>Runs Scored:</label><input type="text" name="runsscored"><br>
			<label>Choose team:</label>
			<select name="teamname">
				<option value="SRH">SRH</option>
				<option value="MI">MI</option>
				<option value="CSK">CSK</option>
				<option value="RCB">RCB</option>
			</select><br>
			<input type="submit">
		</form>
	</fieldset><br>
	
	<fieldset>
	<legend>Get Player</legend>
		<form action="getplayer">
			<label>Player Id</label>
			<input type="text" name="playerid"><br>
			<input type="submit">
		
		</form>
	
	</fieldset><br>
	
	<fieldset>
	<legend>Delete Player</legend>
		<form action="deleteplayer">
			<label>Player Id</label>
			<input type="text" name="playerid"><br>
			<input type="submit">
		
		</form>
	
	</fieldset><br>
	
</body>
</html>