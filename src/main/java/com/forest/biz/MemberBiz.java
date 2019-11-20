package com.forest.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.forest.entity.Member;
import com.forest.mapper.MemberMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class MemberBiz {
				@Autowired
				private MemberMapper memberMapper;
				
				/**
				 * 分页查询会员信息
				 * @param pageNum
				 * @return
				 */
				public PageInfo<Member> queryAllByPage(Integer pageNum){
						PageHelper.startPage(pageNum, 6);
						List<Member> list=memberMapper.queryAllByPage();
						PageInfo<Member> page=new PageInfo<Member>(list);
						return page;
				}
				
				/**
				 * 执行会员新增
				 * @param m
				 * @return
				 */
				public boolean insertMember(Member m) {
						return memberMapper.insertMember(m)>0;
				}
				
				/**
				 * 根据会员编号查询会员信息
				 * @param MemberId
				 * @return
				 */
				public Member queryById(int MemberId) {
					return memberMapper.queryById(MemberId);
				}
}
