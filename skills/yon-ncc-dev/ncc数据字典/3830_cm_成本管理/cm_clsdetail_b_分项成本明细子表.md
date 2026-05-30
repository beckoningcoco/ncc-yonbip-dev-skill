# |<<

**分项成本明细子表 (cm_clsdetail_b / nc.vo.cm.bd.bd0105.ClsdetailItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1454.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cclsdetail_bid | 分项成本明细子表主键 | cclsdetail_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | varchar(0) |  | 组织_集团 (group) |
| 3 | cclsdetailid | 分项成本明细主键 | cclsdetailid | char(20) |  | 主键 (UFID) |
| 4 | pk_org | 库存组织主键 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 5 | pk_org_v | 库存组织版本主键 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 6 | cmaterialid | 物料id | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料版本主键 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 9 | istatus | 状态 | istatus | int |  | 单据状态(成本) (CMStatusEnum) | 1 | 1=自由; |