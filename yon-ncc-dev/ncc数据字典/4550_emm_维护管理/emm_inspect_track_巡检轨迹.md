# |<<

**巡检轨迹 (emm_inspect_track / nc.vo.emm.monitor.InspectTrackVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1802.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inspect_track | 巡检轨迹主键 | pk_inspect_track | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_inspector | 巡检人员主键 | pk_inspector | varchar(20) |  | 人员基本信息 (psndoc) |
| 5 | inspect_time | 巡检时间 | inspect_time | char(19) |  | 日期时间 (UFDateTime) |
| 6 | lng | 经度 | lng | varchar(50) |  | 字符串 (String) |
| 7 | lat | 纬度 | lat | varchar(50) |  | 字符串 (String) |
| 8 | speed | 速度 | speed | decimal(31, 25) |  | 数值 (UFDouble) |
| 9 | sequence | 顺序 | sequence | int |  | 整数 (Integer) |
| 10 | signal_type | 信号类型 | signal_type | varchar(20) |  | 字符串 (String) |
| 11 | accurancy | 精度 | accurancy | decimal(31, 25) |  | 数值 (UFDouble) |
| 12 | keypointflag | 关键点标识 | keypointflag | char(1) |  | 布尔类型 (UFBoolean) |