# |<<

**工作底稿模板 (ufoc_workdrafttemp / nc.vo.ufoc.workdrafttemp.WorkDraftTempVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5898.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workdrafttemp | 主键 | pk_workdrafttemp | char(20) | √ | 主键 (UFID) |
| 2 | pk_report | 所属报表 | pk_report | char(20) |  | 主键 (UFID) |
| 3 | code | 编号 | code | varchar(40) |  | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 6 | pk_keygroup | 关键字组合 | pk_keygroup | varchar(20) |  | 关键字组合 (关键字组合) |
| 7 | isshowascolumn | 单位数据按列显示 | isshowascolumn | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | isshowasrow | 单位数据按行显示 | isshowasrow | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | note | 说明 | note | varchar(1024) |  | 备注 (Memo) |
| 10 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 11 | dataorigin | 数据来源 | dataorigin | varchar(50) |  | 字符串 (String) |
| 12 | unitshowtype | 单位数据显示方式 | unitshowtype | int |  | 单位数据显示方式 (unitshowtype) |  | 1=按行; |