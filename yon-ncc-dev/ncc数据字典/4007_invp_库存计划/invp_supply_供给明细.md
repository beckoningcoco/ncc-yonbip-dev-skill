# |<<

**供给明细 (invp_supply / nc.vo.invp.plan.entity.SupplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3149.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supply | 主键 | pk_supply | varchar(40) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | csupplybillid | 供给单据 | csupplybillid | varchar(20) |  | 主键 (UFID) |
| 6 | csupplytype | 供给单据类型 | csupplytype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | csupplytrantype | 供给单据交易类型 | csupplytrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | csupplycode | 供给单据号 | csupplycode | varchar(50) |  | 字符串 (String) |
| 9 | csupplybillbid | 供给单据明细 | csupplybillbid | varchar(20) |  | 主键 (UFID) |
| 10 | vsupplyrowno | 供给单据行号 | vsupplyrowno | varchar(50) |  | 字符串 (String) |
| 11 | cmaterialoid | 物料编码 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 12 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 14 | dsupplydate | 供给日期 | dsupplydate | char(19) |  | 日期 (UFDate) |
| 15 | dorgsupplydate | 供给的组织日期 | dorgsupplydate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 16 | itimebucket | 时格顺序 | itimebucket | int |  | 整数 (Integer) |
| 17 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 18 | nnum | 可供给量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | ipriority | 优先级 | ipriority | int |  | 整数 (Integer) |