# |<<

**工序信息 (pd_rt_b / nc.vo.bd.rt.rt0008.entity.RtItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4378.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crt_bid | 工序信息 | crt_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | vprocessno | 工序号 | vprocessno | varchar(10) |  | 字符串 (String) |
| 6 | crcid | 标准工序 | crcid | varchar(20) |  | 标准工序 (pd_rc) |
| 7 | vcraftnote | 工艺描述 | vcraftnote | varchar(150) |  | 字符串 (String) |
| 8 | vgraph | 图纸号 | vgraph | varchar(50) |  | 字符串 (String) |
| 9 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 10 | bmainprocess | 主序 | bmainprocess | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | nwaitetime | 等待时间 | nwaitetime | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nworktime | 加工时间 | nworktime | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | ndelivertime | 传送时间 | ndelivertime | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | npreparetime | 准备时间 | npreparetime | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nremovetime | 拆卸时间 | nremovetime | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | noverlap | 重叠时间 | noverlap | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nmixdelivernum | 重叠数量 | nmixdelivernum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nfixperiodnum | 固定周期批量 | nfixperiodnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | bcountpoint | 报告点 | bcountpoint | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | bcheckpoint | 检测点 | bcheckpoint | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | bhandoverpoint | 交接点 | bhandoverpoint | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | vmergeno | 合并号 | vmergeno | varchar(10) |  | 字符串 (String) |
| 23 | deffectdate | 生效日期 | deffectdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 24 | dinvaliddate | 失效日期 | dinvaliddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 25 | novertype | 重叠类型 | novertype | int |  | 重叠类型 (FnoverloptypeEnum) |  | 1=时间重叠; |