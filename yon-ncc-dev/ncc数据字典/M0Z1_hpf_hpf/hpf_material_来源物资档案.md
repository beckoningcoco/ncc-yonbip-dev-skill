# |<<

**来源物资档案 (hpf_material / nc.vo.hpf.hpfmaterial.MaterialVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2638.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_material | 主键 | pk_material | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | syscode | 来源系统 | syscode | varchar(20) |  | 数据来源系统设置 (EntryconfigVO) |
| 6 | code | 物资编码 | code | varchar(50) |  | 字符串 (String) |
| 7 | name | 物资名称 | name | varchar(100) |  | 字符串 (String) |
| 8 | format | 规格 | format | varchar(100) |  | 字符串 (String) |
| 9 | unitcode | 计量单位编码 | unitcode | varchar(100) |  | 字符串 (String) |
| 10 | unitname | 计量单位名称 | unitname | varchar(100) |  | 字符串 (String) |
| 11 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 12 | maketime | 制单时间 | maketime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |