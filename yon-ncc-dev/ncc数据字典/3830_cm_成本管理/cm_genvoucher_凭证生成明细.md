# |<<

**凭证生成明细 (cm_genvoucher / nc.vo.cm.pc.pc0416.VoucherSrcVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1477.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cvoucherdetailid | 凭证生成明细 | cvoucherdetailid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cperiod | 会计期间 | cperiod | char(7) |  | 主键 (UFID) |
| 6 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 8 | nmoney | 金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 10 | cactivityid | 作业 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 11 | ibilltype | 单据类型 | ibilltype | int |  | 来源类型(成本) (CMSourceTypeEnum) |  | 1=自制; |