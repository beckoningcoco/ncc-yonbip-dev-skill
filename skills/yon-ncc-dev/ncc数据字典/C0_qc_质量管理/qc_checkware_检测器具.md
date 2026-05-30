# |<<

**检测器具 (qc_checkware / nc.vo.qc.checkware.entity.CheckWareVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4841.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkware | 检测器具主键 | pk_checkware | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 检测中心 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | vwarecode | 检测器具编码 | vwarecode | varchar(50) |  | 字符串 (String) |
| 4 | vwarename | 检测器具名称 | vwarename | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | vauthorg | 认证机构 | vauthorg | varchar(200) |  | 字符串 (String) |
| 6 | dvalidday | 认证有效期 | dvalidday | char(19) |  | 日期(结束) (UFDateEnd) |
| 7 | benable | 可用 | benable | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |
| 9 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | modifier | 最后维护人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 最后维护时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |