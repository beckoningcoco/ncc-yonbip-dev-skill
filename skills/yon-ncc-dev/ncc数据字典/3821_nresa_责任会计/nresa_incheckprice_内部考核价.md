# |<<

**内部考核价 (nresa_incheckprice / nc.vo.nresa.internalsettlement.incheckprice.InternalCheckPriceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3852.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_incheckprice | 内部考核价主键 | pk_incheckprice | char(20) | √ | 主键 (UFID) |
| 2 | pk_original | 原始版本主键 | pk_original | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 利润中心 | pk_org | varchar(20) |  | 组织_业务单元_责任组织 (liabilitycenter) |
| 5 | pk_billtype | 交易类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 8 | price | 内部核算价 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | begindate | 生效日期 | begindate | char(19) |  | 日期 (UFDate) |
| 10 | enddate | 失效日期 | enddate | char(19) |  | 日期 (UFDate) |
| 11 | ishistoryprice | 是否历史价格 | ishistoryprice | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | memo | 备注 | memo | varchar(500) |  | 字符串 (String) |
| 13 | def1 | 自定义项1 | def1 | varchar(50) |  | 字符串 (String) |
| 14 | def2 | 自定义项2 | def2 | varchar(50) |  | 字符串 (String) |
| 15 | def3 | 自定义项3 | def3 | varchar(50) |  | 字符串 (String) |
| 16 | def4 | 自定义项4 | def4 | varchar(50) |  | 字符串 (String) |
| 17 | def5 | 自定义项5 | def5 | varchar(50) |  | 字符串 (String) |
| 18 | def6 | 自定义项6 | def6 | varchar(50) |  | 字符串 (String) |
| 19 | def7 | 自定义项7 | def7 | varchar(50) |  | 字符串 (String) |
| 20 | def8 | 自定义项8 | def8 | varchar(50) |  | 字符串 (String) |
| 21 | def9 | 自定义项9 | def9 | varchar(50) |  | 字符串 (String) |
| 22 | def10 | 自定义项10 | def10 | varchar(50) |  | 字符串 (String) |
| 23 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 24 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 25 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |