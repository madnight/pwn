% -----------------------------------------------------------------------------
% SQUARES
% -----------------------------------------------------------------------------

space(type('square'), name('a1'), square(point(0, 0), 1)).
space(type('square'), name('a2'), square(point(0, 1), 1)).
space(type('square'), name('a3'), square(point(0, 2), 1)).
space(type('square'), name('a4'), square(point(0, 3), 1)).
space(type('square'), name('a5'), square(point(0, 4), 1)).
space(type('square'), name('a6'), square(point(0, 5), 1)).
space(type('square'), name('a7'), square(point(0, 6), 1)).
space(type('square'), name('a8'), square(point(0, 7), 1)).

% TODO order
space(name('b1'), type('square'), square(point(1, 0), 1)).
space(name('b2'), type('square'), square(point(1, 1), 1)).
space(name('b3'), type('square'), square(point(1, 2), 1)).
space(name('b4'), type('square'), square(point(1, 3), 1)).
space(name('b5'), type('square'), square(point(1, 4), 1)).
space(name('b6'), type('square'), square(point(1, 5), 1)).
space(name('b7'), type('square'), square(point(1, 6), 1)).
space(name('b8'), type('square'), square(point(1, 7), 1)).

space(name('c1'), type('square'), square(point(2, 0), 1)).
space(name('c2'), type('square'), square(point(2, 1), 1)).
space(name('c3'), type('square'), square(point(2, 2), 1)).
space(name('c4'), type('square'), square(point(2, 3), 1)).
space(name('c5'), type('square'), square(point(2, 4), 1)).
space(name('c6'), type('square'), square(point(2, 5), 1)).
space(name('c7'), type('square'), square(point(2, 6), 1)).
space(name('c8'), type('square'), square(point(2, 7), 1)).

space(name('d1'), type('square'), square(point(3, 0), 1)).
space(name('d2'), type('square'), square(point(3, 1), 1)).
space(name('d3'), type('square'), square(point(3, 2), 1)).
space(name('d4'), type('square'), square(point(3, 3), 1)).
space(name('d5'), type('square'), square(point(3, 4), 1)).
space(name('d6'), type('square'), square(point(3, 5), 1)).
space(name('d7'), type('square'), square(point(3, 6), 1)).
space(name('d8'), type('square'), square(point(3, 7), 1)).

space(name('e1'), type('square'), square(point(4, 0), 1)).
space(name('e2'), type('square'), square(point(4, 1), 1)).
space(name('e3'), type('square'), square(point(4, 2), 1)).
space(name('e4'), type('square'), square(point(4, 3), 1)).
space(name('e5'), type('square'), square(point(4, 4), 1)).
space(name('e6'), type('square'), square(point(4, 5), 1)).
space(name('e7'), type('square'), square(point(4, 6), 1)).
space(name('e8'), type('square'), square(point(4, 7), 1)).

space(name('f1'), type('square'), square(point(5, 0), 1)).
space(name('f2'), type('square'), square(point(5, 1), 1)).
space(name('f3'), type('square'), square(point(5, 2), 1)).
space(name('f4'), type('square'), square(point(5, 3), 1)).
space(name('f5'), type('square'), square(point(5, 4), 1)).
space(name('f6'), type('square'), square(point(5, 5), 1)).
space(name('f7'), type('square'), square(point(5, 6), 1)).
space(name('f8'), type('square'), square(point(5, 7), 1)).

space(name('g1'), type('square'), square(point(6, 0), 1)).
space(name('g2'), type('square'), square(point(6, 1), 1)).
space(name('g3'), type('square'), square(point(6, 2), 1)).
space(name('g4'), type('square'), square(point(6, 3), 1)).
space(name('g5'), type('square'), square(point(6, 4), 1)).
space(name('g6'), type('square'), square(point(6, 5), 1)).
space(name('g7'), type('square'), square(point(6, 6), 1)).
space(name('g8'), type('square'), square(point(6, 7), 1)).

space(name('h1'), type('square'), square(point(7, 0), 1)).
space(name('h2'), type('square'), square(point(7, 1), 1)).
space(name('h3'), type('square'), square(point(7, 2), 1)).
space(name('h4'), type('square'), square(point(7, 3), 1)).
space(name('h5'), type('square'), square(point(7, 4), 1)).
space(name('h6'), type('square'), square(point(7, 5), 1)).
space(name('h7'), type('square'), square(point(7, 6), 1)).
space(name('h8'), type('square'), square(point(7, 7), 1)).

% -----------------------------------------------------------------------------
% FILES
% -----------------------------------------------------------------------------

% TODO order
space(name('a'), type('file'), square(point(0, _), _)).
space(name('b'), type('file'), square(point(1, _), _)).
space(name('c'), type('file'), square(point(2, _), _)).
space(name('d'), type('file'), square(point(3, _), _)).
space(name('e'), type('file'), square(point(4, _), _)).
space(name('f'), type('file'), square(point(5, _), _)).
space(name('g'), type('file'), square(point(6, _), _)).
space(name('h'), type('file'), square(point(7, _), _)).

% -----------------------------------------------------------------------------
% RANKS
% -----------------------------------------------------------------------------

space(type('rank'), name('1'), square(point(_, 0), _)).
space(type('rank'), name('2'), square(point(_, 1), _)).
space(type('rank'), name('3'), square(point(_, 2), _)).
space(type('rank'), name('4'), square(point(_, 3), _)).
space(type('rank'), name('5'), square(point(_, 4), _)).
space(type('rank'), name('6'), square(point(_, 5), _)).
space(type('rank'), name('7'), square(point(_, 6), _)).
space(type('rank'), name('8'), square(point(_, 7), _)).
