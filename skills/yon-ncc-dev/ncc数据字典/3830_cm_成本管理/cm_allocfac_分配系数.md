# |<<

**分配系数 (cm_allocfac / nc.vo.mapub.allocfac.entity.AllocfacHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1445.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | callocfacid | 分配系数 | callocfacid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 业务单元 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vcode | 编码 | vcode | varchar(50) |  | 字符串 (String) |
| 6 | vname | 名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 8 | ialloctype | 分配内容 | ialloctype | int |  | 分配内容 (AllocfacEnum) |  | 1=成本中心; |