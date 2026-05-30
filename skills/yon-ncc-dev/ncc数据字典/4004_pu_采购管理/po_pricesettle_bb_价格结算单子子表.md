# |<<

**价格结算单子子表 (po_pricesettle_bb / nc.vo.pu.m24.entity.PricestlItemBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4625.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pricesettle_bb | 价格结算单子子表 | pk_pricesettle_bb | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 采购组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_采购组织 (purchaseorg) |
| 4 | pk_org_v | 采购组织 | pk_org_v | varchar(20) |  | 组织_业务单元_采购组织版本信息 (purchaseorg_v) |
| 5 | cqpschemeid | 优质优价方案主表 | cqpschemeid | varchar(20) |  | 主键 (UFID) |
| 6 | cqpbasestandid | 优质优价主体标准 | cqpbasestandid | varchar(20) |  | 优质优价标准主表 (QPStandardHeaderVO) |
| 7 | cqpstandid | 优质优价标准主表 | cqpstandid | varchar(50) |  | 字符串 (String) |
| 8 | cqpstandbid | 优质优价标准子表 | cqpstandbid | varchar(20) |  | 主键 (UFID) |
| 9 | ipriority | 计算优先级 | ipriority | int |  | 整数 (Integer) |
| 10 | vprecondcode | 计算先决条件编码 | vprecondcode | varchar(996) |  | 字符串 (String) |
| 11 | vprecondname | 计算先决条件 | vprecondname | varchar(996) |  | 字符串 (String) |
| 12 | bweightavg | 检验值是否加权平均 | bweightavg | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | vbaselowlmt | 基准值下限 | vbaselowlmt | varchar(30) |  | 字符串 (String) |
| 14 | vbaseuplmt | 基准值上限 | vbaseuplmt | varchar(30) |  | 字符串 (String) |
| 15 | vcheckvalue | 实际检验值 | vcheckvalue | varchar(30) |  | 字符串 (String) |
| 16 | nstandcalvalue | 计算结果 | nstandcalvalue | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | faccumtype | 累计方式 | faccumtype | int |  | 累计方式 (AccumType) |  | 0=累计; |