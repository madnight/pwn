package de.lmbrs.pwn.todo;

public class Move {

  // % -----------------------------------------------------------------------------
  // % PAWN
  // % -----------------------------------------------------------------------------
  // % if in check only if the move removes the check
  // % if pinned only according to the pin (e.g. along the bishops diagonal or take the piece if
  // possible)
  // % can take? (2 possibilities: fields must have opponents piece)
  // % can advance? (1 or 2 possibilities: field must be empty + starting pos?)
  // % special move en passant
  // % special move promotion
  // % -----------------------------------------------------------------------------
  //
  // move(FEN, SourceSquareName, TargetSquareName) :-
  // parse_fen(FEN, PositionData),
  // space(type('square'), name(SourceSquareName), SourceSquare),
  // space(type('square'), name(TargetSquareName), TargetSquare),
  // % piece(type('pawn'), color(PieceColor) PieceSourcePosition),
  // member(object(type('pawn'), color(PieceColor), PiecePosition), PositionData),
  // % TODO FUNCTIONAL SPACE?
  // topology(inside, PieceSourcePosition, SourceSquare),
  // topology(inside, PieceTargetPosition, TargetSquare).
  //
  // % -----------------------------------------------------------------------------
  // % KNIGHT
  // % -----------------------------------------------------------------------------
  // % if in check only if the move removes the check
  // % if pinned only according to the pin (e.g. along the bishops diagonal or take the piece if
  // possible)
  // % square empty or has opponents piece
  // % -----------------------------------------------------------------------------
  //
  //
  //
  // % -----------------------------------------------------------------------------
  // % BISHOP
  // % -----------------------------------------------------------------------------
  // % move(COLOR, SOURCE_SQUARE, TARGET_SQUARE).
  // % if in check only if the move removes the check
  // % if pinned only according to the pin (e.g. along the bishops diagonal or take the piece if
  // possible)
  // % empty squares along one of the diagonals until:
  // % (A) opponents piece (then this square also)
  // % (B) own piece
  // % -----------------------------------------------------------------------------
  //
  //
  //
  // % -----------------------------------------------------------------------------
  // % ROOK
  // % -----------------------------------------------------------------------------
  // % if in check only if the move removes the check
  // % if pinned only according to the pin (e.g. along the bishops diagonal or take the piece if
  // possible)
  // % along same file or rank until opponents piece (take) or own piece
  // % -----------------------------------------------------------------------------
  //
  //
  //
  // % -----------------------------------------------------------------------------
  // % QUEEN
  // % if in check only if the move removes the check
  // % if pinned only according to the pin (e.g. along the bishops diagonal or take the piece if
  // possible)
  // % -----------------------------------------------------------------------------
  //
  //
  //
  // % -----------------------------------------------------------------------------
  // % KING
  // % -----------------------------------------------------------------------------
  // % 1 square in each direction if:
  // % - square not attacked
  // % - square not occupied by own piece
  // % - square not occupied by opponents piece which is protected
  // % special move: castling and consider check / attacked squares
  // % -----------------------------------------------------------------------------

}
