# |<<

**放款计划版本 (lcm_payplan_v / nc.vo.lcm.docucontractv.DocuPayPlanVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3577.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 版本PK | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_payplan | 主键 | pk_payplan | varchar(50) |  | 字符串 (String) |
| 3 | paycode | 放款编号 | paycode | varchar(50) |  | 字符串 (String) |
| 4 | paydate | 放款日期 | paydate | char(19) |  | 日期 (UFDate) |
| 5 | payamount | 放款金额 | payamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | olcpayamount | 放款本币金额 | olcpayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | glcpayamount | 集团放款本币金额 | glcpayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | gllcpayamount | 全局放款本币金额 | gllcpayamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | serialno | 序号 | serialno | int |  | 整数 (Integer) |
| 10 | operatedate | 处理日期 | operatedate | char(19) |  | 日期 (UFDate) |
| 11 | operateflag | 放款标志 | operateflag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 13 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 14 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 15 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |