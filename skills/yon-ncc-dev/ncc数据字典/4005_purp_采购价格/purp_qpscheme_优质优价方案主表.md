# |<<

**优质优价方案主表 (purp_qpscheme / nc.vo.pp.hqhp.qpschm.entity.QPSchmHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4811.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_qpscheme | 主键 | pk_qpscheme | char(20) | √ | 主键 (UFID) |
| 2 | pk_qpschemebase | 优质优价主体方案主键 | pk_qpschemebase | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 采购组织 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | vschemecode | 方案编码 | vschemecode | varchar(50) |  | 字符串 (String) |
| 6 | vschemename | 方案名称 | vschemename | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | bseal | 封存 | bseal | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | blatest | 最新版本 | blatest | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | nversion | 版本号 | nversion | int |  | 整数 (Integer) |
| 11 | fcaldatetype | 计价日期类型 | fcaldatetype | int |  | 计价日期类型 (Caldatetype) |  | 0=到货日期; |