package com.yehia.mira_calendar_date_range.customviews

import java.util.*

interface CalendarListener {
    /**
     * Called on first date selection.
     * @param startDate First selected date.
     */
    fun onFirstDateSelected(startDate: Calendar)

    /**
     * Called on first and last date selection.
     * @param startDate First date.
     * @param endDate Last date.
     */
    fun onDateRangeSelected(startDate: Calendar, endDate: Calendar)
}