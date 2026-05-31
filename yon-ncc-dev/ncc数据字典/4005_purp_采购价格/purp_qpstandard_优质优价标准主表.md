# |<<

**优质优价标准主表 (purp_qpstandard / nc.vo.pp.hqhp.qpstandard.entity.QPStandardHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4813.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_qpstandard | 主键 | pk_qpstandard | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 采购组织 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | blatest | 最新版本 | blatest | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | nversion | 版本号 | nversion | int |  | 整数 (Integer) |
| 6 | fvaluetype | 标准值类型 | fvaluetype | int |  | 标准值类型 (ValueType) |  | 0=数字型; |