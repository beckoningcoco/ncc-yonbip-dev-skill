# |<<

**轮班生成维护 (bd_teamcalendar / nc.vo.pd.shiftdetail.entity.TeamCalendarVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/999.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_teamcalendar | 轮班 | pk_teamcalendar | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 6 | pk_shift | 班次 | pk_shift | varchar(20) |  | 班次 (bdshift) |
| 7 | pk_team | 班组 | pk_team | varchar(20) |  | 班组定义维护表信息 (bd_team) |
| 8 | calendar | 日期 | calendar | char(10) |  | 模糊日期 (UFLiteralDate) |
| 9 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 10 | original_shift_b4exg | 假日对调前原班次 | original_shift_b4exg | varchar(20) |  | 班次 (bdshift) |
| 11 | original_shift_b4cut | 假日切割前原班次 | original_shift_b4cut | varchar(20) |  | 班次 (bdshift) |
| 12 | gzsj | 工作时长 | gzsj | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | if_rest | 是否休假 | if_rest | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | cancelflag | 当日排班遇假日取消、保留的标志 | cancelflag | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | iswtrecreate | 工作时间段重新生成标志 | iswtrecreate | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | isflexiblefinal | 最终是否弹性 | isflexiblefinal | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | ismanuctrl | 是否由制造控制 | ismanuctrl | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 21 | modifiedtime | 最后修改时间 | modifiedtime | varchar(19) |  | 日期时间 (UFDateTime) |