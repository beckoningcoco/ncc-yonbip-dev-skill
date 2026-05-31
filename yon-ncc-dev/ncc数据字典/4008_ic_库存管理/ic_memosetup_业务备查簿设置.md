# |<<

**业务备查簿设置 (ic_memosetup / nc.vo.module.ic_memosetup.MemoSetup)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2926.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmemosetupid | 业务备查簿设置主键 | cmemosetupid | char(20) | √ | 主键 (UFID) |
| 2 | pk_corp | 公司 | pk_corp | varchar(20) |  | 主键 (UFID) |
| 3 | vmemocode | 帐目编码 | vmemocode | varchar(50) |  | 字符串 (String) |
| 4 | vmemoname | 帐目名称 | vmemoname | varchar(50) |  | 字符串 (String) |
| 5 | fmemotype | 帐目格式 | fmemotype | int |  | 整数 (Integer) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 主键 (UFID) |