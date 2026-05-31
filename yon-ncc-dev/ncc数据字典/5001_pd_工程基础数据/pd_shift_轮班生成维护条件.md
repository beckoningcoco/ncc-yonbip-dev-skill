# |<<

**轮班生成维护条件 (pd_shift / nc.vo.pd.shiftdetail.entity.TeamCalendarHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4382.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccondid | 条件主键 | ccondid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 6 | dcalendardate | 日期 | dcalendardate | char(19) |  | 日期 (UFDate) |
| 7 | dbegindate | 开始日期 | dbegindate | char(19) |  | 日期(开始) (UFDateBegin) |
| 8 | denddate | 结束日期 | denddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 9 | ishiftcircle | 轮班周期天数 | ishiftcircle | int |  | 整数 (Integer) |
| 10 | icirclenum | 周期数 | icirclenum | int |  | 整数 (Integer) |