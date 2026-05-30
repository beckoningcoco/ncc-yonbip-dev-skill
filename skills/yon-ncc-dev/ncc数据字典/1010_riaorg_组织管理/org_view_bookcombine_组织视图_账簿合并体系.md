# |<<

**组织视图_账簿合并体系 (org_view_bookcombine / nc.vo.org.orgview.OrgViewBookCombineSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4188.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bcssub | 账簿合并体系子表主键 | pk_bcssub | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(20) |  | 组织结构_账簿合并体系成员 (bookcombinestrumember) |
| 4 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(200) |  | 字符串 (String) |
| 6 | shortname | 简称 | shortname | varchar(50) |  | 字符串 (String) |
| 7 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 8 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 9 | pk_bcs | 所属账簿合并体系 | pk_bcs | varchar(20) |  | 组织结构_账簿合并体系 (bookcombinestru) |
| 10 | ismanageorg | 账簿管理组织 | ismanageorg | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_entityorg | 对应实体组织 | pk_entityorg | varchar(20) |  | 组织_业务单元_报表组织 (reportorg) |
| 12 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |