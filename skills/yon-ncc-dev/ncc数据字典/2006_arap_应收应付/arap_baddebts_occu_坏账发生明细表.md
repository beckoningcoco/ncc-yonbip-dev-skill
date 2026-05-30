# |<<

**坏账发生明细表 (arap_baddebts_occu / nc.vo.arap.baddebts.BaddebtsOccuVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/147.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_baddebts_occu | 坏账发生id | pk_baddebts_occu | char(20) | √ | 主键 (UFID) |
| 2 | pk_baddebts_occh | 坏账发生主表id | pk_baddebts_occh | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | scomment | 摘要 | scomment | varchar(300) |  | 字符串 (String) |
| 6 | busidate | 处理日期 | busidate | char(19) |  | 日期 (UFDate) |
| 7 | busiyear | 处理年度 | busiyear | char(4) |  | 主键 (UFID) |
| 8 | busiperiod | 处理期间 | busiperiod | char(2) |  | 主键 (UFID) |
| 9 | billmaker | 处理人 | billmaker | varchar(20) |  | 用户 (user) |
| 10 | pk_bill | 主表ID | pk_bill | char(20) |  | 主键 (UFID) |
| 11 | pk_item | 单据辅表ID | pk_item | char(20) |  | 主键 (UFID) |
| 12 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 13 | billno | 单据编号 | billno | varchar(40) |  | 字符串 (String) |
| 14 | billclass | 单据大类 | billclass | varchar(50) |  | 单据大类 (billclass) |  | ys=应收单; |