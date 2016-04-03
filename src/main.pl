:- consult(clpqs/clpqs).
:- consult(core/board).
:- consult(core/move).

% TODO read https://en.wikipedia.org/wiki/Glossary_of_board_games

% SAMPLE DATA
piece('pawn', point(0.5, 0.5)).

move(FEN, SourceSquare, TargetSquare) :-
    FEN = 'rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1',
    SourceSquare = 'a1',
    TargetSquare = 'a2'.
