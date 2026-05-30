# |<<

**工艺路线模板子表 (pd_rttemplate_b / nc.vo.bd.rt.rt0006.entity.RtTemplateItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4381.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crttemplate_bid | 工序信息 | crttemplate_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | vprocessno | 工序号 | vprocessno | varchar(50) | √ | 字符串 (String) |
| 6 | crcid | 标准工序 | crcid | varchar(20) |  | 标准工序 (pd_rc) |
| 7 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 8 | bmainprocess | 主序 | bmainprocess | char(1) |  | 布尔类型 (UFBoolean) | N |
| 9 | nwaitetime | 等待时间 | nwaitetime | decimal(20, 8) |  | 数值 (UFDouble) |
| 10 | nworktime | 加工时间 | nworktime | decimal(20, 8) | √ | 数值 (UFDouble) |
| 11 | ndelivertime | 传送时间 | ndelivertime | decimal(20, 8) |  | 数值 (UFDouble) |
| 12 | npreparetime | 准备时间 | npreparetime | decimal(20, 8) |  | 数值 (UFDouble) |
| 13 | nremovetime | 拆卸时间 | nremovetime | decimal(20, 8) |  | 数值 (UFDouble) |
| 14 | noverlap | 重叠时间 | noverlap | decimal(20, 8) |  | 数值 (UFDouble) |
| 15 | bcountpoint | 报告点 | bcountpoint | char(1) |  | 布尔类型 (UFBoolean) | N |
| 16 | bcheckpoint | 检测点 | bcheckpoint | char(1) |  | 布尔类型 (UFBoolean) | N |
| 17 | bhandoverpoint | 交接点 | bhandoverpoint | char(1) |  | 布尔类型 (UFBoolean) | N |
| 18 | vmergeno | 合并号 | vmergeno | varchar(10) |  | 字符串 (String) |
| 19 | deffectdate | 生效日期 | deffectdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 20 | dinvaliddate | 失效日期 | dinvaliddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 21 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 22 | vcraftnote | 工艺说明 | vcraftnote | varchar(150) |  | 字符串 (String) |
| 23 | nmixdelivernum | 重叠数量 | nmixdelivernum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | novertype | 重叠类型 | novertype | int |  | 重叠类型 (FnoverloptypeEnum) |  | 1=时间重叠; |