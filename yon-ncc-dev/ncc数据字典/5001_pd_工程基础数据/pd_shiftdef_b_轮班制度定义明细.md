# |<<

**轮班制度定义明细 (pd_shiftdef_b / nc.vo.pd.shiftdef.entity.LbdyItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4384.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cshiftdefbid | 轮班制度定义明细 | cshiftdefbid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂最新版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cbteamid | 班组 | cbteamid | varchar(20) |  | 班组定义维护表信息 (bd_team) |
| 6 | fbcyclenum | 周期号 | fbcyclenum | int |  | 整数 (Integer) |
| 7 | cbshiftid | 班次 | cbshiftid | varchar(20) |  | 班次 (bdshift) |