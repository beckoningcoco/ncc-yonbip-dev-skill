# |<<

**合并科目表 (iufo_hbaccchart / nc.vo.hbbb.account.HBAccChartVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3447.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accchart | 主键 | pk_accchart | char(20) | √ | 主键 (UFID) |
| 2 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | coderule | 科目编码规则 | coderule | varchar(50) |  | 字符串 (String) |
| 5 | pk_accsystem | 所属科目体系 | pk_accsystem | varchar(20) |  | 科目体系 (accsystem) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | innercode | 内部码 | innercode | varchar(50) |  | 字符串 (String) |
| 9 | pk_parent | 上级科目表主键 | pk_parent | varchar(20) |  | 合并科目表 (合并科目表) |
| 10 | pk_uapchart_vid | 会计科目表 | pk_uapchart_vid | varchar(20) |  | 科目表 (accchart) |