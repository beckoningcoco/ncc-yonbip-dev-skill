# |<<

**BdMonitorItemVO (Bd_MonitorItem / com.yonyou.yh.nhis.cn.hims.vo.BdMonitorItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/915.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_monitor_item | 主键 | pk_monitor_item | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | item_code | 检测项目编码 | item_code | varchar(50) |  | 字符串 (String) |
| 6 | item_name | 检测项目名称 | item_name | varchar(50) |  | 字符串 (String) |
| 7 | sort_no | 序号 | sort_no | varchar(50) |  | 字符串 (String) |
| 8 | pk_srv | 医嘱服务主键 | pk_srv | varchar(20) |  | 字符串 (String) |
| 9 | py_code | 拼音码 | py_code | varchar(50) |  | 字符串 (String) |
| 10 | defdoc_name | 检测项目分类 | defdoc_name | varchar(50) |  | 字符串 (String) |
| 11 | defdoc_code | 检测项目分类编码 | defdoc_code | varchar(50) |  | 字符串 (String) |
| 12 | pk_defdoc | 检测项目分类pk | pk_defdoc | varchar(20) |  | 字符串 (String) |
| 13 | flag_enable | 启用 | flag_enable | char(1) |  | 字符串 (String) |
| 14 | remarks | 备注 | remarks | varchar(200) |  | 字符串 (String) |
| 15 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 16 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 17 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 18 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 19 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 20 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 21 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 22 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 23 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 24 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 25 | def11 | 自定义项11 | def11 | varchar(100) |  | 字符串 (String) |
| 26 | def12 | 自定义项12 | def12 | varchar(100) |  | 字符串 (String) |
| 27 | def13 | 自定义项13 | def13 | varchar(100) |  | 字符串 (String) |
| 28 | def14 | 自定义项14 | def14 | varchar(100) |  | 字符串 (String) |
| 29 | def15 | 自定义项15 | def15 | varchar(100) |  | 字符串 (String) |
| 30 | def16 | 自定义项16 | def16 | varchar(100) |  | 字符串 (String) |
| 31 | def17 | 自定义项17 | def17 | varchar(100) |  | 字符串 (String) |
| 32 | def18 | 自定义项18 | def18 | varchar(100) |  | 字符串 (String) |
| 33 | def19 | 自定义项19 | def19 | varchar(100) |  | 字符串 (String) |
| 34 | def20 | 自定义项20 | def20 | varchar(100) |  | 字符串 (String) |
| 35 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 36 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 37 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 38 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |