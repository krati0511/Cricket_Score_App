var unique_id
team = team.toLowerCase()

for(var i=0; i<match_list.length; i++) {
  team1 = match_list[i]["team-1"].toLowerCase()
  team2 = match_list[i]["team-2"].toLowerCase()
  
  if (team1 == team || team2 == team) {
    unique_id = match_list[i].unique_id
    break
  }
}