package mate.academy.rickandmorty.service;

import mate.academy.rickandmorty.dto.RickCharacterDto;

import java.util.List;

public interface RickCharacterService  {
    RickCharacterDto getRandomCharacter();
    List<RickCharacterDto> searchCharacters(String name);
}
