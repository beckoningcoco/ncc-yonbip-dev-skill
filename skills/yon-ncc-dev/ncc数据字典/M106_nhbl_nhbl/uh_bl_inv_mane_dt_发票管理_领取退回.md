# |<<

**发票管理_领取退回 (uh_bl_inv_mane_dt / nc.vo.nhbl.inv.BlInvManeDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5936.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ivcmanadt | 发票管理明细主键 | pk_ivcmanadt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | dt_invtype | 发票类型 | dt_invtype | char(20) |  | 主键 (UFID) |
| 5 | eu_direct | 领退方向 | eu_direct | int |  | 领退方向 (DirectEnum) |  | 1=领取; |