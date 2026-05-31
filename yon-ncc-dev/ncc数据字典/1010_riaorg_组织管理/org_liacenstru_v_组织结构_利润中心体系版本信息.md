# |<<

**组织结构_利润中心体系版本信息 (org_liacenstru_v / nc.vo.vorg.LiabilityCenterStruVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4090.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 利润中心体系版本主键 | pk_vid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 利润中心体系所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vname | 版本名称 | vname | varchar(50) |  | 字符串 (String) |
| 4 | vno | 版本号 | vno | varchar(50) |  | 字符串 (String) |
| 5 | vstartdate | 版本生效日期 | vstartdate | char(19) |  | 日期 (UFDate) |
| 6 | venddate | 版本失效日期 | venddate | char(19) |  | 日期 (UFDate) |
| 7 | islastversion | 是否最新版本 | islastversion | char(1) |  | 布尔类型 (UFBoolean) |