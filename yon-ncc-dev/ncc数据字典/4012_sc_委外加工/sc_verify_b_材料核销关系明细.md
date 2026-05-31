# |<<

**材料核销关系明细 (sc_verify_b / nc.vo.sc.m66.entity.VerifyItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5029.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verify_b | 材料核销关系明细 | pk_verify_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | pk_materailout | 材料出库单 | pk_materailout | varchar(20) |  | 材料出库单表头 (MaterialOutHeadVO) |
| 6 | pk_materailout_b | 材料出库单体 | pk_materailout_b | varchar(20) |  | 材料出库单表体 (MaterialOutBodyVO) |
| 7 | vmaterailoutbillcode | 材料出库单号 | vmaterailoutbillcode | varchar(40) |  | 字符串 (String) |
| 8 | dbilldate | 单据日期 | dbilldate | varchar(19) |  | 日期 (UFDate) |