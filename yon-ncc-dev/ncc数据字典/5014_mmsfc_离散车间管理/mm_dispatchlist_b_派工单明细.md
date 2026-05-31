# |<<

**派工单明细 (mm_dispatchlist_b / nc.vo.mmsfc.dispatchlist.entity.DispatchlistItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3659.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dispatchlist_b | 派工单明细标识 | pk_dispatchlist_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 3 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | vboperationno | 工序号 | vboperationno | varchar(20) |  | 字符串 (String) |
| 6 | cboperationtypeid | 工序说明 | cboperationtypeid | varchar(20) |  | 标准工序 (pd_rc) |
| 7 | cbdeptid | 生产部门最新版本 | cbdeptid | varchar(20) |  | 组织_部门 (dept) |
| 8 | cbdeptvid | 生产部门 | cbdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 9 | cbwkid | 工作中心 | cbwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 10 | cbshiftid | 班次 | cbshiftid | varchar(20) |  | 班次 (bdshift) |
| 11 | cbteamid | 班组 | cbteamid | varchar(20) |  | 班组定义维护表信息 (bd_team) |
| 12 | cbworkman | 人员 | cbworkman | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | vbbatchid | 生产批次 | vbbatchid | varchar(20) |  | 字符串 (String) |
| 14 | vbbatchcode | 生产批次号 | vbbatchcode | varchar(40) |  | 字符串 (String) |
| 15 | bbwrpoint | 报告点 | bbwrpoint | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | bbcheckpoint | 检测点 | bbcheckpoint | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | fbtransfertype | 工序转移方式 | fbtransfertype | int |  | 工序转移方式 (ProcessMoveTypeEnum) |  | 1=不转移; |