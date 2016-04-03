% -----------------------------------------------------------------------------
% PAWN
% -----------------------------------------------------------------------------
% if in check only if the move removes the check
% if pinned only according to the pin (e.g. along the bishops diagonal or take the piece if possible)
% can take? (2 possibilities: fields must have opponents piece)
% can advance? (1 possibility: field must be empty)
% special move en passant
% special move promotion
% -----------------------------------------------------------------------------

move(SourceSquareName, TargetSquareName) :-
    space(SourceSquareName, SourceSquare),
    space(TargetSquareName, TargetSquare),
    piece('pawn', SourcePoint),
    topology(inside, SourcePoint, SourceSquare),
    topology(inside, TargetPoint, TargetSquare).

% -----------------------------------------------------------------------------
% KNIGHT
% -----------------------------------------------------------------------------
% if in check only if the move removes the check
% if pinned only according to the pin (e.g. along the bishops diagonal or take the piece if possible)
% square empty or has opponents piece
% -----------------------------------------------------------------------------



% -----------------------------------------------------------------------------
% BISHOP
% -----------------------------------------------------------------------------
% move(COLOR, SOURCE_SQUARE, TARGET_SQUARE).
% if in check only if the move removes the check
% if pinned only according to the pin (e.g. along the bishops diagonal or take the piece if possible)
% empty squares along one of the diagonals until:
% (A) opponents piece (then this square also)
% (B) own piece
% -----------------------------------------------------------------------------



% -----------------------------------------------------------------------------
% ROOK
% -----------------------------------------------------------------------------
% if in check only if the move removes the check
% if pinned only according to the pin (e.g. along the bishops diagonal or take the piece if possible)
% along same file or rank until opponents piece (take) or own piece
% -----------------------------------------------------------------------------



% -----------------------------------------------------------------------------
% QUEEN
% if in check only if the move removes the check
% if pinned only according to the pin (e.g. along the bishops diagonal or take the piece if possible)
% -----------------------------------------------------------------------------



% -----------------------------------------------------------------------------
% KING
% -----------------------------------------------------------------------------
% 1 square in each direction if:
% - square not attacked
% - square not occupied by own piece
% - square not occupied by opponents piece which is protected
% special move: castling and consider check / attacked squares
% -----------------------------------------------------------------------------
