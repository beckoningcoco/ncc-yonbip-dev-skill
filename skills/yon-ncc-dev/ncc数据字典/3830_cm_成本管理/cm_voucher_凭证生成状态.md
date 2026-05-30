# |<<

**凭证生成状态 (cm_voucher / nc.vo.cm.pc.pc0416.VoucherStatusVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1520.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cvoucherid | 凭证生成状态 | cvoucherid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cperiod | 会计期间 | cperiod | char(7) |  | 主键 (UFID) |
| 6 | ibilltype | 单据类型 | ibilltype | varchar(50) |  | 来源类型(成本) (CMSourceTypeEnum) |  | 1=自制; |