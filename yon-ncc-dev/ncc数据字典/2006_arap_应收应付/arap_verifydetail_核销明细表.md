# |<<

**核销明细表 (arap_verifydetail / nc.vo.arap.verify.VerifyDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/203.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verifydetail | 核销明细表id | pk_verifydetail | char(20) | √ | 主键 (UFID) |
| 2 | redflag | 红冲标记 | redflag | int |  | 整数 (Integer) |
| 3 | isauto | 自动处理 | isauto | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | isreserve | 预占用 | isreserve | int |  | 整数 (Integer) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | scomment | 摘要 | scomment | varchar(300) |  | 字符串 (String) |
| 8 | pk_verify | 处理表ID | pk_verify | char(20) | √ | 主键 (UFID) |
| 9 | busidate | 处理日期 | busidate | char(19) |  | 日期 (UFDate) |
| 10 | busiyear | 处理年度 | busiyear | varchar(4) |  | 字符串 (String) |
| 11 | busiperiod | 处理期间 | busiperiod | varchar(2) |  | 字符串 (String) |
| 12 | busino | 处理批次号 | busino | varchar(28) |  | 字符串 (String) |
| 13 | rate | 核销汇率 | rate | decimal(15, 8) |  | 数值 (UFDouble) |
| 14 | pk_bill | 主表ID | pk_bill | char(20) |  | 主键 (UFID) |
| 15 | pk_item | 单据辅表ID | pk_item | char(20) |  | 主键 (UFID) |
| 16 | pk_termitem | 单据付款协议表ID | pk_termitem | char(20) |  | 主键 (UFID) |
| 17 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 18 | billno | 单据编号 | billno | varchar(40) |  | 字符串 (String) |
| 19 | billclass | 单据大类 | billclass | varchar(50) |  | 单据大类 (billclass) |  | ys=应收单; |