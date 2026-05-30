# |<<

**标准工序 (pd_rc / nc.vo.bd.rt.rt0004.entity.RcVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4374.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crcid | 标准工序 | crcid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | vrccode | 工序编码 | vrccode | varchar(40) |  | 字符串 (String) |
| 6 | vrcname | 工序名称 | vrcname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 8 | nwaitetime | 等待时间 | nwaitetime | decimal(20, 8) |  | 数值 (UFDouble) |
| 9 | nworktime | 加工时间 | nworktime | decimal(20, 8) |  | 数值 (UFDouble) |
| 10 | ndelivertime | 传送时间 | ndelivertime | decimal(20, 8) |  | 数值 (UFDouble) |
| 11 | npreparetime | 准备时间 | npreparetime | decimal(20, 8) |  | 数值 (UFDouble) |
| 12 | nremovetime | 拆卸时间 | nremovetime | decimal(20, 8) |  | 数值 (UFDouble) |
| 13 | bcountpoint | 报告点 | bcountpoint | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | bcheckpoint | 检测点 | bcheckpoint | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | bhandoverpoint | 交接点 | bhandoverpoint | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | vmergeno | 合并号 | vmergeno | varchar(10) |  | 字符串 (String) |
| 17 | vcraftnote | 备注 | vcraftnote | varchar(150) |  | 字符串 (String) |
| 18 | enablestate | 启用状态 | enablestate | int |  | 生产制造启用状态 (RcEnum) | 2 | 2=已启用; |