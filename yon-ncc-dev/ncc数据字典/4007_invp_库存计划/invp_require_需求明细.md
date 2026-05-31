# |<<

**需求明细 (invp_require / nc.vo.invp.plan.entity.RequireVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3145.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_require | 主键 | pk_require | varchar(40) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | creqbillid | 需求单据 | creqbillid | varchar(20) |  | 主键 (UFID) |
| 5 | vreqtype | 需求单据类型 | vreqtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | vreqtrantype | 需求单据交易类型 | vreqtrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | vreqbillcode | 需求单据号 | vreqbillcode | varchar(50) |  | 字符串 (String) |
| 8 | creqbillbid | 需求单据明细 | creqbillbid | varchar(20) |  | 主键 (UFID) |
| 9 | vreqrowno | 需求单据行号 | vreqrowno | varchar(50) |  | 字符串 (String) |
| 10 | nnum | 需求数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | cmaterialoid | 物料编码 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 12 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 15 | dreqdate | 需求日期 | dreqdate | char(19) |  | 日期 (UFDate) |
| 16 | dorgreqdate | 需求组织日期 | dorgreqdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 17 | itimebucket | 时格顺序 | itimebucket | int |  | 整数 (Integer) |
| 18 | nallocnum | 预留量 | nallocnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | ipriority | 优先级 | ipriority | int |  | 整数 (Integer) |
| 20 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |