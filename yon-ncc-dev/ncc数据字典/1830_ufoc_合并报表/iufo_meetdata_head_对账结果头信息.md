# |<<

**对账结果头信息 (iufo_meetdata_head / nc.vo.hbbb.meetaccount.MeetResultHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3481.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_totalinfo | 主键 | pk_totalinfo | char(20) | √ | 主键 (UFID) |
| 2 | alone_id | alone_id | alone_id | varchar(50) |  | 字符串 (String) |
| 3 | pk_selforg | 本方组织 | pk_selforg | varchar(20) |  | 组织_业务单元_报表组织 (reportorg) |
| 4 | pk_countorg | 对方组织 | pk_countorg | varchar(20) |  | 组织_业务单元_报表组织 (reportorg) |
| 5 | pk_meetorg | 对账组织 | pk_meetorg | varchar(20) |  | 组织_业务单元_报表组织 (reportorg) |
| 6 | ismeetable | 对符状态 | ismeetable | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_hbscheme | 合并方案 | pk_hbscheme | varchar(20) |  | 合并方案 (hbscheme) |
| 8 | pk_dxrelation | 抵销模板 | pk_dxrelation | varchar(20) |  | 调整及抵销模板 (dxrelation) |
| 9 | note | 说明 | note | varchar(200) |  | 多语文本 (MultiLangText) |
| 10 | pk_keygroup | 关键字组合 | pk_keygroup | varchar(20) |  | 合并方案关键字 (合并方案关键字) |
| 11 | pk_difrule | 对账规则 | pk_difrule | varchar(20) |  | 抵销差额规则 (DXRelaDiffRuleVO) |
| 12 | noteshow | 显示子表对账说明 | noteshow | varchar(40) |  | 字符串 (String) |
| 13 | dataorigin | 数据来源 | dataorigin | varchar(50) |  | 字符串 (String) |
| 14 | ismeetequal | 等值/差额对符 | ismeetequal | char(1) |  | 布尔类型 (UFBoolean) |