# |<<

**组织视图-成本域视图 (org_view_costreg / nc.vo.org.orgview.OrgViewCostRegionSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4190.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costregionsub | 主键 | pk_costregionsub | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织单元 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) |  | 字符串 (String) |
| 5 | pk_fatherorg | 上级业务单元 | pk_fatherorg | varchar(20) |  | 组织 (org) |
| 6 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 7 | shortname | 简称 | shortname | varchar(50) |  | 字符串 (String) |
| 8 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 9 | pk_financeorg | 所属财务组织 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 10 | financeorg_name | 所属财务组织名 | financeorg_name | varchar(50) |  | 字符串 (String) |
| 11 | pk_stockorg | 所属库存组织 | pk_stockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 12 | stockorg_name | 所属库存组织名 | stockorg_name | varchar(50) |  | 字符串 (String) |
| 13 | iscostregion | 成本域 | iscostregion | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | isfinanceorg | 财务组织 | isfinanceorg | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | isstockorg | 库存组织 | isstockorg | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | isrepertoryorg | 仓库组织 | isrepertoryorg | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |