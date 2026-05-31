# |<<

**质量不合格类型 (qc_rejecttype / nc.vo.scmf.qc.rejecttype.entity.RejectTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4854.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rejecttype | 不合格类型主键 | pk_rejecttype | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 质检中心 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | vrejecttypecode | 质量不合格类型编码 | vrejecttypecode | varchar(20) |  | 字符串 (String) |
| 4 | vrejecttypename | 质量不合格类型名称 | vrejecttypename | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | parentrejtype | 上级质量不合格类型 | parentrejtype | varchar(20) |  | 质量不合格类型 (qc_rejecttype) |
| 6 | vmemo | 备注 | vmemo | varchar(181) |  | 备注 (Memo) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |