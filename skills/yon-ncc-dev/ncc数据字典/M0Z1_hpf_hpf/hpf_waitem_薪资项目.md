# |<<

**薪资项目 (hpf_waitem / nc.vo.hpf.hpfwaitem.WaitemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2652.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_waitem | 主键 | pk_waitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | syscode | 来源系统 | syscode | varchar(20) |  | 数据来源系统设置 (EntryconfigVO) |
| 6 | code | 薪资项目编码 | code | varchar(50) |  | 字符串 (String) |
| 7 | name | 薪资项目名称 | name | varchar(100) |  | 字符串 (String) |
| 8 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 9 | maketime | 制单时间 | maketime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |