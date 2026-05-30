# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12250.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | allow_legwork | allow_legwork | allow_legwork | char(1) |
| 3 | attend_period | attend_period | attend_period | varchar2(36) |
| 4 | busiorg | busiorg | busiorg | varchar2(36) |
| 5 | changescheduday | changescheduday | changescheduday | number(38, 0) |
| 6 | changeshift | changeshift | changeshift | char(1) |
| 7 | commit_legwork_approve | commit_legwork_approve | commit_legwork_approve | char(1) |
| 8 | isenable | isenable | isenable | char(1) |
| 9 | is_calculate | is_calculate | is_calculate | char(1) |
| 10 | is_face_detect | is_face_detect | is_face_detect | char(1) |
| 11 | is_late_early_notice | is_late_early_notice | is_late_early_notice | char(1) |
| 12 | is_work_shift | is_work_shift | is_work_shift | char(1) |
| 13 | legwork_approve_type | legwork_approve_type | legwork_approve_type | char(1) |
| 14 | limit_time | limit_time | limit_time | number(38, 0) |
| 15 | loose_classes_month | loose_classes_month | loose_classes_month | char(1) |
| 16 | mobile_schedule | mobile_schedule | mobile_schedule | char(1) |
| 17 | notice_type | notice_type | notice_type | char(1) |
| 18 | overtime_approval | overtime_approval | overtime_approval | char(1) |
| 19 | replaceshift | replaceshift | replaceshift | char(1) |
| 20 | role_id | role_id | role_id | varchar2(36) |
| 21 | role_name | role_name | role_name | varchar2(36) |
| 22 | shift_id | shift_id | shift_id | varchar2(4000) |
| 23 | shift_id_name | shift_id_name | shift_id_name | varchar2(36) |
| 24 | shift_mode_fix | shift_mode_fix | shift_mode_fix | char(1) |
| 25 | shift_name | shift_name | shift_name | varchar2(100) |
| 26 | shift_name2 | shift_name2 | shift_name2 | varchar2(100) |
| 27 | shift_name3 | shift_name3 | shift_name3 | varchar2(100) |
| 28 | shift_name4 | shift_name4 | shift_name4 | varchar2(100) |
| 29 | shift_name5 | shift_name5 | shift_name5 | varchar2(100) |
| 30 | shift_name6 | shift_name6 | shift_name6 | varchar2(100) |
| 31 | space_id | space_id | space_id | varchar2(36) |
| 32 | switchshift | switchshift | switchshift | char(1) |
| 33 | tenantid | tenantid | tenantid | varchar2(36) |
| 34 | times_per_month | times_per_month | times_per_month | number(38, 0) |
| 35 | use_place | use_place | use_place | char(1) |
| 36 | use_wifi | use_wifi | use_wifi | char(1) |
| 37 | workhour | workhour | workhour | char(1) |
| 38 | work_calendar_id | work_calendar_id | work_calendar_id | varchar2(36) |
| 39 | work_calendar_name | work_calendar_name | work_calendar_name | varchar2(36) |
| 40 | creationtime | creationtime | creationtime | date |
| 41 | creator | creator | creator | varchar2(36) |
| 42 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 43 | modifiedtime | modifiedtime | modifiedtime | date |
| 44 | modifier | modifier | modifier | varchar2(36) |
| 45 | ts | ts | ts | date |  |  | sysdate |