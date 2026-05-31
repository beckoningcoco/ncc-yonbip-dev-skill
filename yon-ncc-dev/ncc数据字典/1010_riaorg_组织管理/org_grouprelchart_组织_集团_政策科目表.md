# |<<

**组织_集团_政策科目表 (org_grouprelchart / nc.vo.org.GroupRelChartVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4074.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rel | 关联主键 | pk_rel | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_accpolicychart | 政策性科目表 | pk_accpolicychart | char(20) | √ | 科目表 (accchart) |
| 4 | pk_accchartsystem | 所属科目体系 | pk_accchartsystem | char(20) | √ | 科目体系 (accsystem) |