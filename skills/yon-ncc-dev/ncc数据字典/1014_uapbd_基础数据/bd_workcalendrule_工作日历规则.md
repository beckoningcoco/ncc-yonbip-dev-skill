# |<<

**工作日历规则 (bd_workcalendrule / nc.vo.bd.workcalendrule.WorkCalendarRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1160.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workcalendrule | 主键 | pk_workcalendrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 4 | code | 工作日历规则编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 工作日历规则名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | ondutytime | 上班时间 | ondutytime | varchar(8) |  | 字符串 (String) |
| 7 | offdutytime | 下班时间 | offdutytime | varchar(8) |  | 字符串 (String) |
| 8 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 9 | sunday | 周日 | sunday | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | monday | 周一 | monday | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | tuesday | 周二 | tuesday | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | wednesday | 周三 | wednesday | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | thursday | 周四 | thursday | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | friday | 周五 | friday | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | saturday | 周六 | saturday | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |