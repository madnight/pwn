package de.lmbrs.pwn.todo;

public class Board {

  // % -----------------------------------------------------------------------------
  // % SQUARES
  // % -----------------------------------------------------------------------------
  //
  // space(type('square'), name('a1'), square(point(0, 0), 1)).
  // space(type('square'), name('a2'), square(point(0, 1), 1)).
  // space(type('square'), name('a3'), square(point(0, 2), 1)).
  // space(type('square'), name('a4'), square(point(0, 3), 1)).
  // space(type('square'), name('a5'), square(point(0, 4), 1)).
  // space(type('square'), name('a6'), square(point(0, 5), 1)).
  // space(type('square'), name('a7'), square(point(0, 6), 1)).
  // space(type('square'), name('a8'), square(point(0, 7), 1)).
  //
  // space(type('square'), name('b1'), square(point(1, 0), 1)).
  // space(type('square'), name('b2'), square(point(1, 1), 1)).
  // space(type('square'), name('b3'), square(point(1, 2), 1)).
  // space(type('square'), name('b4'), square(point(1, 3), 1)).
  // space(type('square'), name('b5'), square(point(1, 4), 1)).
  // space(type('square'), name('b6'), square(point(1, 5), 1)).
  // space(type('square'), name('b7'), square(point(1, 6), 1)).
  // space(type('square'), name('b8'), square(point(1, 7), 1)).
  //
  // space(type('square'), name('c1'), square(point(2, 0), 1)).
  // space(type('square'), name('c2'), square(point(2, 1), 1)).
  // space(type('square'), name('c3'), square(point(2, 2), 1)).
  // space(type('square'), name('c4'), square(point(2, 3), 1)).
  // space(type('square'), name('c5'), square(point(2, 4), 1)).
  // space(type('square'), name('c6'), square(point(2, 5), 1)).
  // space(type('square'), name('c7'), square(point(2, 6), 1)).
  // space(type('square'), name('c8'), square(point(2, 7), 1)).
  //
  // space(type('square'), name('d1'), square(point(3, 0), 1)).
  // space(type('square'), name('d2'), square(point(3, 1), 1)).
  // space(type('square'), name('d3'), square(point(3, 2), 1)).
  // space(type('square'), name('d4'), square(point(3, 3), 1)).
  // space(type('square'), name('d5'), square(point(3, 4), 1)).
  // space(type('square'), name('d6'), square(point(3, 5), 1)).
  // space(type('square'), name('d7'), square(point(3, 6), 1)).
  // space(type('square'), name('d8'), square(point(3, 7), 1)).
  //
  // space(type('square'), name('e1'), square(point(4, 0), 1)).
  // space(type('square'), name('e2'), square(point(4, 1), 1)).
  // space(type('square'), name('e3'), square(point(4, 2), 1)).
  // space(type('square'), name('e4'), square(point(4, 3), 1)).
  // space(type('square'), name('e5'), square(point(4, 4), 1)).
  // space(type('square'), name('e6'), square(point(4, 5), 1)).
  // space(type('square'), name('e7'), square(point(4, 6), 1)).
  // space(type('square'), name('e8'), square(point(4, 7), 1)).
  //
  // space(type('square'), name('f1'), square(point(5, 0), 1)).
  // space(type('square'), name('f2'), square(point(5, 1), 1)).
  // space(type('square'), name('f3'), square(point(5, 2), 1)).
  // space(type('square'), name('f4'), square(point(5, 3), 1)).
  // space(type('square'), name('f5'), square(point(5, 4), 1)).
  // space(type('square'), name('f6'), square(point(5, 5), 1)).
  // space(type('square'), name('f7'), square(point(5, 6), 1)).
  // space(type('square'), name('f8'), square(point(5, 7), 1)).
  //
  // space(type('square'), name('g1'), square(point(6, 0), 1)).
  // space(type('square'), name('g2'), square(point(6, 1), 1)).
  // space(type('square'), name('g3'), square(point(6, 2), 1)).
  // space(type('square'), name('g4'), square(point(6, 3), 1)).
  // space(type('square'), name('g5'), square(point(6, 4), 1)).
  // space(type('square'), name('g6'), square(point(6, 5), 1)).
  // space(type('square'), name('g7'), square(point(6, 6), 1)).
  // space(type('square'), name('g8'), square(point(6, 7), 1)).
  //
  // space(type('square'), name('h1'), square(point(7, 0), 1)).
  // space(type('square'), name('h2'), square(point(7, 1), 1)).
  // space(type('square'), name('h3'), square(point(7, 2), 1)).
  // space(type('square'), name('h4'), square(point(7, 3), 1)).
  // space(type('square'), name('h5'), square(point(7, 4), 1)).
  // space(type('square'), name('h6'), square(point(7, 5), 1)).
  // space(type('square'), name('h7'), square(point(7, 6), 1)).
  // space(type('square'), name('h8'), square(point(7, 7), 1)).
  //
  // % -----------------------------------------------------------------------------
  // % FILES
  // % -----------------------------------------------------------------------------
  //
  // space(type('file'), name('a-file'), square(point(0, _), _)).
  // space(type('file'), name('b-file'), square(point(1, _), _)).
  // space(type('file'), name('c-file'), square(point(2, _), _)).
  // space(type('file'), name('d-file'), square(point(3, _), _)).
  // space(type('file'), name('e-file'), square(point(4, _), _)).
  // space(type('file'), name('f-file'), square(point(5, _), _)).
  // space(type('file'), name('g-file'), square(point(6, _), _)).
  // space(type('file'), name('h-file'), square(point(7, _), _)).
  //
  // % -----------------------------------------------------------------------------
  // % RANKS
  // % -----------------------------------------------------------------------------
  //
  // space(type('rank'), name('1st rank'), square(point(_, 0), _)).
  // space(type('rank'), name('2nd rank'), square(point(_, 1), _)).
  // space(type('rank'), name('3rd rank'), square(point(_, 2), _)).
  // space(type('rank'), name('4th rank'), square(point(_, 3), _)).
  // space(type('rank'), name('5th rank'), square(point(_, 4), _)).
  // space(type('rank'), name('6th rank'), square(point(_, 5), _)).
  // space(type('rank'), name('7th rank'), square(point(_, 6), _)).
  // space(type('rank'), name('8th rank'), square(point(_, 7), _)).

}
