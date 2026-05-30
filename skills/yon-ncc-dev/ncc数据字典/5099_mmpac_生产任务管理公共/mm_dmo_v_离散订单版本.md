# |<<

**离散订单版本 (mm_dmo_v / nc.vo.mmpac.dmo.entity.DmoVerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3666.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dmo_v | 离散生产订单版本 | pk_dmo_v | char(20) | √ | 主键 (UFID) |
| 2 | pk_dmo | 离散生产订单 | pk_dmo | varchar(20) |  | 字符串 (String) |
| 3 | version | 订单版本号 | version | varchar(10) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 6 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 7 | pk_planorg | 计划组织最新版本 | pk_planorg | varchar(20) |  | 组织 (org) |
| 8 | pk_planorg_v | 计划组织 | pk_planorg_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 9 | fbillstatus | 订单状态 | fbillstatus | int |  | 离散生产订单状态 (DmoStatusEnum) |  | -1=自由; |