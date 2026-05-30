# |<<

**退货理由设置 (scm_backreason / nc.vo.scmf.pu.backreason.entity.BackReasonVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5205.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_backreason | 主键 | pk_backreason | char(20) | √ | 主键 (UFID) |
| 2 | vbackreasoncode | 编码 | vbackreasoncode | varchar(30) |  | 字符串 (String) |
| 3 | vbackreasonname | 名称 | vbackreasonname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | dinvalidate | 失效日期 | dinvalidate | varchar(19) |  | 日期 (UFDate) |
| 5 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |
| 6 | pk_org | 组织 | pk_org | varchar(20) |  | 组织其它_用户主组织 (usermainorg) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织其它_用户可管理的集团 (useradmingroup) |