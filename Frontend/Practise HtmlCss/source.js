const URL = "https://cat-fact.herokuapp.com/facts";

const getFacts = async () => {
    let response = await fetch(URL);
    console.log(response);
};